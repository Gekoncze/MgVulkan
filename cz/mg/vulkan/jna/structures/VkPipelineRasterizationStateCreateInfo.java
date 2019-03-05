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
 *  typedef struct VkPipelineRasterizationStateCreateInfo {
 *      VkStructureType                            sType;
 *      const void*                                pNext;
 *      VkPipelineRasterizationStateCreateFlags    flags;
 *      VkBool32                                   depthClampEnable;
 *      VkBool32                                   rasterizerDiscardEnable;
 *      VkPolygonMode                              polygonMode;
 *      VkCullModeFlags                            cullMode;
 *      VkFrontFace                                frontFace;
 *      VkBool32                                   depthBiasEnable;
 *      float                                      depthBiasConstantFactor;
 *      float                                      depthBiasClamp;
 *      float                                      depthBiasSlopeFactor;
 *      float                                      lineWidth;
 *  } VkPipelineRasterizationStateCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineRasterizationStateCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineRasterizationStateCreateFlags flags;
    public VkBool32 depthClampEnable;
    public VkBool32 rasterizerDiscardEnable;
    public VkPolygonMode polygonMode;
    public VkCullModeFlags cullMode;
    public VkFrontFace frontFace;
    public VkBool32 depthBiasEnable;
    public float depthBiasConstantFactor;
    public float depthBiasClamp;
    public float depthBiasSlopeFactor;
    public float lineWidth;

    public VkPipelineRasterizationStateCreateInfo() {
    }

    public VkPipelineRasterizationStateCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "depthClampEnable",
                "rasterizerDiscardEnable",
                "polygonMode",
                "cullMode",
                "frontFace",
                "depthBiasEnable",
                "depthBiasConstantFactor",
                "depthBiasClamp",
                "depthBiasSlopeFactor",
                "lineWidth"
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

    public static class ByReference extends VkPipelineRasterizationStateCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineRasterizationStateCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
