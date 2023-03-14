#!/usr/bin/env ruby

require 'date'

PRODUCT_PRICE_MAP = {
  "Lens Cleaner" => 5.12,
  "Headphones" => 149.99,
  "Designing Data-Intensive Applications by Martin Kleppmann" => 56.12,
  "1L Bottle" => 14.49,
  "Egyptian Coasters" => 2.35,
  "iPhone 14 Pro Max" => 1099,
  "Shiva Statue" => 10.08,
  "iPhone Cable" => 19.99,
}

def get_random_item_amount
  product_name = PRODUCT_PRICE_MAP.keys[rand(0..PRODUCT_PRICE_MAP.length-1)]

  price = PRODUCT_PRICE_MAP[product_name]

  [product_name, price]
end

def generate_sale
  quantity = rand(1..10)

  item, unit_price = get_random_item_amount
  "#{DateTime.now}, #{item}, #{unit_price}, #{quantity}, #{(quantity * unit_price).round(2)}"
end

log_file = Date.new(2009,11,26).to_time.to_i

# mkdir -p /var/logs/sales

while true
  sale_line = generate_sale

  File.write("/var/logs/sales/#{log_file}.log", sale_line+"\n", mode: 'a')
  # puts sale_line

  sleep 1
end
