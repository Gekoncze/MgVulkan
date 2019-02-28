package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;


/**
 *  typedef struct VkDebugUtilsObjectNameInfoEXT {
 *      VkStructureType    sType;
 *      const void*        pNext;
 *      VkObjectType       objectType;
 *      uint64_t           objectHandle;
 *      const char*        pObjectName;
 *  } VkDebugUtilsObjectNameInfoEXT;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsObjectNameInfoEXT.html">khronos documentation</a>
 **/
public class VkDebugUtilsObjectNameInfoEXT extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkObjectType objectType;
    public uint64_t objectHandle;
    public byte[] pObjectName;

    public VkDebugUtilsObjectNameInfoEXT() {
    }

    public VkDebugUtilsObjectNameInfoEXT(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "objectType",
                "objectHandle",
                "pObjectName"
        });
    }

    public ByReference byReference(boolean write, boolean read){
        if(write) write();
        ByReference reference = new ByReference(getPointer());
        if(read) reference.read();
        return reference;
    }

    public ByValue byValue(boolean write, boolean read){
        if(write) write();
        ByValue value = new ByValue(getPointer());
        if(read) value.read();
        return value;
    }

    public static class ByReference extends VkDebugUtilsObjectNameInfoEXT implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkDebugUtilsObjectNameInfoEXT implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
