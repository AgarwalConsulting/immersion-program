# ReSTful API

CRUD => Create, Read, Update, Destroy

HTTP Methods => GET, PUT, POST, PATCH, DELETE, ...

---

## Employee management service

CRUD      Action          HTTP Method                 URI                   Request                   Response
--------------------------------------------------------------------------------------------------------------------
Read      Index            GET                      /employees                -                       [{...}, ...]
Read      Show             GET                      /employees/{id}           -                         {...}
