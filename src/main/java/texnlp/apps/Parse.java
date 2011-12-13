///////////////////////////////////////////////////////////////////////////////
// Copyright (C) 2007 Jason Baldridge, The University of Texas at Austin
// 
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
//////////////////////////////////////////////////////////////////////////////
package texnlp.apps;

import texnlp.ccg.CKY;
import texnlp.ccg.Cell;
import texnlp.ccg.TestLexicon;

/**
 * Get the CCG parser going.
 * 
 * @author Jason Baldridge
 * @version $Revision: 1.53 $, $Date: 2006/10/12 21:20:44 $
 */
public class Parse {

    public static void parseStuff() {
        String sentence = "Calvin sees Hobbes";
        System.out.println("Parsing: " + sentence);

        CKY parser = new CKY(new TestLexicon());

        Cell result = parser.parse(sentence);
        System.out.println(result);

        System.out.println(parser.parse("Calvin walks"));
        System.out.println(parser.parse("sees Calvin"));

        System.out.println(parser.parse("Calvin thinks Susie walks"));
        System.out.println(parser.parse("boy who sees Hobbes"));
        System.out.println(parser.parse("boy who sees Hobbes thinks Susie walks"));

        System.out.println(parser.parse("Calvin sees Moe"));

        System.out.println(parser.parse("buffalo buffalo buffalo"));

        // System.out.println(parser.parse(""));

    }

    public static void main(String[] args) {

        // genCats();
        parseStuff();

    }

}