Fetch Data 

url =localhost:2000/graphql (method Post)

query{
    getBook(bookId:1){
        id
        title
        desc
        author
        price
    }
}

Response 
{
    "data": {
        "getBook": {
            "id": "1",
            "title": "java",
            "desc": "this is first book",
            "author": "xyz",
            "price": 1000.0
        }
    }
}

Add Data 

localhost:2000/graphql (method Post)
Request


mutation{
    createBook(book:{
         title: "java grqphql",
            desc: "this is first book grqphql",
            author: "xyz grqphql",
            price: 1000.0,
            pages:111
    }){
        id
        title
    }
}

Response

{
    "data": {
        "createBook": {
            "id": "5",
            "title": "java grqphql"
        }
    }
}


