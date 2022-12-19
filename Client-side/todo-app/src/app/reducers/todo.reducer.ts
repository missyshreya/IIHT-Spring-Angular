import { ActionParent } from "../actions/todo.actions";
import { Todo } from "../models/Todo";

const initialState:Todo[]=[
    {title:"titile 1"},
    {title:"titile 2"},
    {title:"titile 3"}
];

export function TodoReducer(state= initialState, action: ActionParent){
            switch(action.type){
            default: return state;
        }
    }
