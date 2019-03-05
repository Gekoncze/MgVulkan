package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.structures.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;
import cz.mg.vulkan.jna.handles.*;


/**
 *  typedef struct VkPipelineDynamicStateCreateInfo {
 *      VkStructureType                      sType;
 *      const void*                          pNext;
 *      VkPipelineDynamicStateCreateFlags    flags;
 *      uint32_t                             dynamicStateCount;
 *      const VkDynamicState*                pDynamicStates;
 *  } VkPipelineDynamicStateCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDynamicStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineDynamicStateCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineDynamicStateCreateFlags flags;
    public uint32_t dynamicStateCount;
    public Pointer pDynamicStates;

    public VkPipelineDynamicStateCreateInfo() {
    }

    public VkPipelineDynamicStateCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "dynamicStateCount",
                "pDynamicStates"
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

    public static class ByReference extends VkPipelineDynamicStateCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineDynamicStateCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
