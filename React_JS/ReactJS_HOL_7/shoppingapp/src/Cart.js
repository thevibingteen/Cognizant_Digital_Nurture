import React, { Component } from "react";

class Cart extends Component {
    render() {
        const { item } = this.props;

        return (
            <tr>
                <td>{item.itemName}</td>
                <td>₹{item.price}</td>
            </tr>
        );
    }
}

export default Cart;