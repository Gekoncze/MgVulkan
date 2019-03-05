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
 *  typedef struct VkPipelineMultisampleStateCreateInfo {
 *      VkStructureType                          sType;
 *      const void*                              pNext;
 *      VkPipelineMultisampleStateCreateFlags    flags;
 *      VkSampleCountFlagBits                    rasterizationSamples;
 *      VkBool32                                 sampleShadingEnable;
 *      float                                    minSampleShading;
 *      const VkSampleMask*                      pSampleMask;
 *      VkBool32                                 alphaToCoverageEnable;
 *      VkBool32                                 alphaToOneEnable;
 *  } VkPipelineMultisampleStateCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineMultisampleStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineMultisampleStateCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineMultisampleStateCreateFlags flags;
    public VkSampleCountFlags rasterizationSamples;
    public VkBool32 sampleShadingEnable;
    public float minSampleShading;
    public Pointer pSampleMask;
    public VkBool32 alphaToCoverageEnable;
    public VkBool32 alphaToOneEnable;

    public VkPipelineMultisampleStateCreateInfo() {
    }

    public VkPipelineMultisampleStateCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "rasterizationSamples",
                "sampleShadingEnable",
                "minSampleShading",
                "pSampleMask",
                "alphaToCoverageEnable",
                "alphaToOneEnable"
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

    public static class ByReference extends VkPipelineMultisampleStateCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineMultisampleStateCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
