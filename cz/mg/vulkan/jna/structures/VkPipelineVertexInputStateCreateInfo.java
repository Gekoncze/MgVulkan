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
 *  typedef struct VkPipelineVertexInputStateCreateInfo {
 *      VkStructureType                             sType;
 *      const void*                                 pNext;
 *      VkPipelineVertexInputStateCreateFlags       flags;
 *      uint32_t                                    vertexBindingDescriptionCount;
 *      const VkVertexInputBindingDescription*      pVertexBindingDescriptions;
 *      uint32_t                                    vertexAttributeDescriptionCount;
 *      const VkVertexInputAttributeDescription*    pVertexAttributeDescriptions;
 *  } VkPipelineVertexInputStateCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineVertexInputStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineVertexInputStateCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineVertexInputStateCreateFlags flags;
    public uint32_t vertexBindingDescriptionCount;
    public Pointer pVertexBindingDescriptions;
    public uint32_t vertexAttributeDescriptionCount;
    public Pointer pVertexAttributeDescriptions;

    public VkPipelineVertexInputStateCreateInfo() {
    }

    public VkPipelineVertexInputStateCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "vertexBindingDescriptionCount",
                "pVertexBindingDescriptions",
                "vertexAttributeDescriptionCount",
                "pVertexAttributeDescriptions"
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

    public static class ByReference extends VkPipelineVertexInputStateCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineVertexInputStateCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
