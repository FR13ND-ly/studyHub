import { File } from "./file.model";

export interface Answer {
    topic : string,
    user : string,
    date : string,
    content : string,
    files : Array<File>
}