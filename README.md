# springBootWithGraphQL

to run :
gradle bootRun

install a chrome extension Altair for graphql ui i hav emapped to app
go to localhost:8080/graphql and type in ur queries 

example query:

    # Welcome to Altair GraphQL Client.
{
  findAllBooks {
    id 
    title
    author {
      id
      firstName
    }
  }
}

