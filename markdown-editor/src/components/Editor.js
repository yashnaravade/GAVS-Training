import React, {useEffect, useState} from 'react'
import ReactMarkdown from 'react-markdown';
import "./Editor.css";
import iconImg from './editor-icon.png';

function Editor() {
    const [markdown, setMarkdown] = useState('# sup');
    
    useEffect(() => {
        const savedMarkdown = localStorage.getItem('markdown');
        if (savedMarkdown) {
        setMarkdown(savedMarkdown);
        }
    }, []);
    
    useEffect(() => {
        localStorage.setItem('markdown', markdown);
    }, [markdown]);
    
    return (
        <div className="editor">
        <div className="editor__header">
            <img src={iconImg} alt="Editor icon" className="editor__icon"/>
            <h1 className="editor__title">Markdown Editor</h1>
        </div>
        <textarea className="editor__textarea" value={markdown} onChange={(e) => setMarkdown(e.target.value)} />
        <ReactMarkdown className="editor__preview" source={markdown} />
        </div>
    )
    }

export default Editor