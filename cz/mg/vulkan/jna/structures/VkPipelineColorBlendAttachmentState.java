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
 *  typedef struct VkPipelineColorBlendAttachmentState {
 *      VkBool32                 blendEnable;
 *      VkBlendFactor            srcColorBlendFactor;
 *      VkBlendFactor            dstColorBlendFactor;
 *      VkBlendOp                colorBlendOp;
 *      VkBlendFactor            srcAlphaBlendFactor;
 *      VkBlendFactor            dstAlphaBlendFactor;
 *      VkBlendOp                alphaBlendOp;
 *      VkColorComponentFlags    colorWriteMask;
 *  } VkPipelineColorBlendAttachmentState;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineColorBlendAttachmentState.html">khronos documentation</a>
 **/
public class VkPipelineColorBlendAttachmentState extends Structure {
    public VkBool32 blendEnable;
    public VkBlendFactor srcColorBlendFactor;
    public VkBlendFactor dstColorBlendFactor;
    public VkBlendOp colorBlendOp;
    public VkBlendFactor srcAlphaBlendFactor;
    public VkBlendFactor dstAlphaBlendFactor;
    public VkBlendOp alphaBlendOp;
    public VkColorComponentFlags colorWriteMask;

    public VkPipelineColorBlendAttachmentState() {
    }

    public VkPipelineColorBlendAttachmentState(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "blendEnable",
                "srcColorBlendFactor",
                "dstColorBlendFactor",
                "colorBlendOp",
                "srcAlphaBlendFactor",
                "dstAlphaBlendFactor",
                "alphaBlendOp",
                "colorWriteMask"
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

    public static class ByReference extends VkPipelineColorBlendAttachmentState implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineColorBlendAttachmentState implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
