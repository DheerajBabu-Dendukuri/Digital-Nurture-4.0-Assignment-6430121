import { Component } from "react";
import './Posts.css'

class Posts extends Component{
    constructor(props){
        super(props);
        this.state = {
            posts: [],
        };
    }

    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((response) => response.json())
        .then((data) => {
            this.setState({posts : data});
        })
        .catch((error) => this.componentDidCatch(error));
    }

    componentDidMount(){
        this.loadPosts();
    }

    componentDidCatch(error, info){
        alert(`Error fetching posts : ${error.message}`)
    }

    render(){
        // const {posts} = this.state.posts;
        return(
            <div className="Posts">
                <h2>Posts: </h2>
                {this.state.posts.map((post) => (
                    <div key={post.id} className="Post">
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr/>
                    </div>
                ))}
            </div>
        );
    }
}


export default Posts;