'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {books: []};
    }

    // The API invoked after React renders a component in the DOM.
    componentDidMount() {
        client({method: 'GET', path: '/api/books'}).done(response => {
            this.setState({books: response.entity._embedded.books});
        });
    }

    // The API to "draw" the component on the screen.
    render() {
        return (
            <BookList books={this.state.books}/>
        )
    }
}

class BookList extends React.Component {

    render() {
        var books = this.props.books.map(book =>
            <Book key={book._links.self.href} book={book} />
        );
        return (
                <table>
                    <tbody>
                        <tr>
                            <th>Title</th>
                            <th>著者</th>
                            <th>Publisher</th>
                            <th>PublishDate</th>
                        </tr>
                        {books}
                    </tbody>
                </table>
            )
    }
}

class Book extends React.Component {

    render() {
        return(
            <tr>
                <td>{this.props.book.title}</td>
                <td>{this.props.book.author}</td>
                <td>{this.props.book.publisher}</td>
                <td>{this.props.book.publishDate}</td>
            </tr>
        )
    }
}

// render the whole thing
ReactDOM.render(
    <App />,
    document.getElementById('react')
)