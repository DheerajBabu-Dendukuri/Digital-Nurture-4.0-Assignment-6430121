import React from 'react';

const blogs = [
    {
        title: 'Hooks Overview',
        author: 'Jane Doe',
        content: 'Hooks let you use state and other React features without writing a class.'
    },
    {
        title: 'Component Lifecycle',
        author: 'John Smith',
        content: 'Understanding the lifecycle of a React component is crucial for building robust apps.'
    },
    {
        title: 'State Management',
        author: 'Emily Clark',
        content: 'State management can be handled using Context API or external libraries like Redux.'
    }
];
const BlogDetails = () => {

    return (
        <div className="column">
            <h2>Blog Details</h2>
            {blogs.map((blog, idx) => (
                <div key={idx}>
                    <strong>{blog.title}</strong>
                    <p><b>{blog.author}</b></p>
                    <p>{blog.content}</p>
                </div>
            ))}
        </div>
    );
};

export default BlogDetails;