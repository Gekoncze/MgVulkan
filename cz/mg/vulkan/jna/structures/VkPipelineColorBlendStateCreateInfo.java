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
 *  typedef struct VkPipelineColorBlendStateCreateInfo {
 *      VkStructureType                               sType;
 *      const void*                                   pNext;
 *      VkPipelineColorBlendStateCreateFlags          flags;
 *      VkBool32                                      logicOpEnable;
 *      VkLogicOp                                     logicOp;
 *      uint32_t                                      attachmentCount;
 *      const VkPipelineColorBlendAttachmentState*    pAttachments;
 *      float                                         blendConstants[4];
 *  } VkPipelineColorBlendStateCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineColorBlendStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineColorBlendStateCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineColorBlendStateCreateFlags flags;
    public VkBool32 logicOpEnable;
    public VkLogicOp logicOp;
    public uint32_t attachmentCount;
    public Pointer pAttachments;
    public float[] blendConstants = new float[4];

    public VkPipelineColorBlendStateCreateInfo() {
    }

    public VkPipelineColorBlendStateCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "logicOpEnable",
                "logicOp",
                "attachmentCount",
                "pAttachments",
                "blendConstants[4]"
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

    public static class ByReference extends VkPipelineColorBlendStateCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineColorBlendStateCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
