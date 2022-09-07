import { UserProfile } from "firebase/auth";

export interface User extends UserProfile {
    username : string,
    email : string,
    imageUrl : string,
    backgroundImageUrl : string,
    date : string,
    expert : boolean,
    isStaff : boolean,
    restrictAvatar : boolean,
    restrictUsername : boolean,
    restrictAnswers : boolean,
    Github? : string,
    LinkedIn? : string,
    Facebook? : string,
    Instagram? : string,
    Reddit? : string
}