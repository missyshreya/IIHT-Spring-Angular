import { ActionParent } from "../actions/todo.actions";
import { Todo } from "../models/Todo";
import { TodoActionType } from "../shared/todo-actions-types.enum";

const initialState: Todo[] = [
    { title: "titile 1" },
    { title: "titile 2" },
    { title: "titile 3" }
];

export function TodoReducer(state = initialState, action: ActionParent) {
    switch (action.type) {
        case TodoActionType.Add:
            return [...state, action.payload]
        case TodoActionType.Remove:
            let newState=[...state]
            newState.splice(action.payload,1);
            return newState;
        default: 
            return state;


    }
}
