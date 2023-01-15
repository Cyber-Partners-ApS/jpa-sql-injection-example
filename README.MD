# SQL injection example
This project is made to demonstrate how the EntityManager in Spring can be vulnerable for SQL injections.

The project contains 2 endpoints that yield tha same result, the difference is that one endpoint is vulnerable for SQL injections and the other is not (due to using named queries).

## Endpoints

`/user/all`  
`/user/{id}`  
`/user/safe/{id}`

## Example

Start the project and request all the users by requesting `/user/all`. This endpoint is only made for viewing the id's of the test data.

Request `/user/{id}` with a valid user id and see the name of the user being returned.

Now request the following for exposing all the user names `http://localhost:8080/user/'OR%201=1%20--`

Last you can try to request the same but to the safe endpoint `http://localhost:8080/user/safe/'OR%201=1%20--`