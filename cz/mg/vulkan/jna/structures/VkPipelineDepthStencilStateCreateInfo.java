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
 *  typedef struct VkPipelineDepthStencilStateCreateInfo {
 *      VkStructureType                           sType;
 *      const void*                               pNext;
 *      VkPipelineDepthStencilStateCreateFlags    flags;
 *      VkBool32                                  depthTestEnable;
 *      VkBool32                                  depthWriteEnable;
 *      VkCompareOp                               depthCompareOp;
 *      VkBool32                                  depthBoundsTestEnable;
 *      VkBool32                                  stencilTestEnable;
 *      VkStencilOpState                          front;
 *      VkStencilOpState                          back;
 *      float                                     minDepthBounds;
 *      float                                     maxDepthBounds;
 *  } VkPipelineDepthStencilStateCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineDepthStencilStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineDepthStencilStateCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineDepthStencilStateCreateFlags flags;
    public VkBool32 depthTestEnable;
    public VkBool32 depthWriteEnable;
    public VkCompareOp depthCompareOp;
    public VkBool32 depthBoundsTestEnable;
    public VkBool32 stencilTestEnable;
    public VkStencilOpState front;
    public VkStencilOpState back;
    public float minDepthBounds;
    public float maxDepthBounds;

    public VkPipelineDepthStencilStateCreateInfo() {
    }

    public VkPipelineDepthStencilStateCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "depthTestEnable",
                "depthWriteEnable",
                "depthCompareOp",
                "depthBoundsTestEnable",
                "stencilTestEnable",
                "front",
                "back",
                "minDepthBounds",
                "maxDepthBounds"
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

    public static class ByReference extends VkPipelineDepthStencilStateCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineDepthStencilStateCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
