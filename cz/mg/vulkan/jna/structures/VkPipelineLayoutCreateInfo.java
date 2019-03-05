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
 *  typedef struct VkPipelineLayoutCreateInfo {
 *      VkStructureType                 sType;
 *      const void*                     pNext;
 *      VkPipelineLayoutCreateFlags     flags;
 *      uint32_t                        setLayoutCount;
 *      const VkDescriptorSetLayout*    pSetLayouts;
 *      uint32_t                        pushConstantRangeCount;
 *      const VkPushConstantRange*      pPushConstantRanges;
 *  } VkPipelineLayoutCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayoutCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineLayoutCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineLayoutCreateFlags flags;
    public uint32_t setLayoutCount;
    public Pointer pSetLayouts;
    public uint32_t pushConstantRangeCount;
    public Pointer pPushConstantRanges;

    public VkPipelineLayoutCreateInfo() {
    }

    public VkPipelineLayoutCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "setLayoutCount",
                "pSetLayouts",
                "pushConstantRangeCount",
                "pPushConstantRanges"
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

    public static class ByReference extends VkPipelineLayoutCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineLayoutCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
