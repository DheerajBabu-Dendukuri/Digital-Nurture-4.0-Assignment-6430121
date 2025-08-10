import React from 'react';

const courses = [
    { name: 'Node.js', date: '19/6/2024' },
    { name: 'Angular', date: '4/9/2024' },
    { name: 'React', date: '6/11/2024' }
];
const CourseDetails = () => {

    return (
        <div className="column">
            <h2>Course Details</h2>
            {courses.map((course, idx) => (
                <div key={idx}>
                    <strong>{course.name}</strong>
                    <p>{course.date}</p>
                </div>
            ))}
        </div>
    );
};

export default CourseDetails;