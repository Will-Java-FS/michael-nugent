import { useRef, useState } from "react";

export default function ActorList() {

    const [actors, setActors] = useState(["Ryan Reynolds", "Hugh Jackman"]);

    const actorInput = useRef<HTMLInputElement>(null);
    const actorListItems = actors.map((a: string) => <li key={a}>{a}</li>)

    function addActor() {
        const actor = actorInput.current!.value;

        actorInput.current!.value = "";

        if (actors.includes(actor)) {
            alert('"' + actor + '" already exists in the list');
        }
        else {
            setActors([...actors, actor]);
        }

    }

    return (
        <>
            <h3>Actor List</h3>
            <ul>
                {actorListItems}
            </ul>
            <input ref={actorInput} />
            <button onClick={addActor}>Add Actor</button>
        </>
    )
}