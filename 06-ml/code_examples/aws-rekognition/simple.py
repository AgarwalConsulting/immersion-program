import boto3
import json
import io
from PIL import Image

s3 = boto3.resource('s3')
bucket_name = 'synchrony2303'
# s3.create_bucket(Bucket=bucket_name)
# print("Created bucket successfully!")

file_path = '/tmp/africa.png'
key_name = 'africa.png'
s3.Object(bucket_name, key_name).put(Body=open(file_path, 'rb'))
print("Uploaded image to bucket successfully!")

# ----

rekognition = boto3.client('rekognition')
image_data = s3.Object(bucket_name, key_name).get()['Body'].read()
image = Image.open(io.BytesIO(image_data))
print("Retrieved image from bucket successfully!")

response = rekognition.detect_labels(
    Image={'Bytes': image_data},
    MaxLabels=10,
    MinConfidence=90
)
print("Invoked rekognition successfully!")

print(json.dumps(response['Labels'], indent=4))
