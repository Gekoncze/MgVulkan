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
 *  typedef struct VkPipelineViewportStateCreateInfo {
 *      VkStructureType                       sType;
 *      const void*                           pNext;
 *      VkPipelineViewportStateCreateFlags    flags;
 *      uint32_t                              viewportCount;
 *      const VkViewport*                     pViewports;
 *      uint32_t                              scissorCount;
 *      const VkRect2D*                       pScissors;
 *  } VkPipelineViewportStateCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineViewportStateCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineViewportStateCreateFlags flags;
    public uint32_t viewportCount;
    public Pointer pViewports;
    public uint32_t scissorCount;
    public Pointer pScissors;

    public VkPipelineViewportStateCreateInfo() {
    }

    public VkPipelineViewportStateCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "viewportCount",
                "pViewports",
                "scissorCount",
                "pScissors"
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

    public static class ByReference extends VkPipelineViewportStateCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineViewportStateCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
