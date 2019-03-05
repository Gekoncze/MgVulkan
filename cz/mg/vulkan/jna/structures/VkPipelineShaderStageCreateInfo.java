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
 *  typedef struct VkPipelineShaderStageCreateInfo {
 *      VkStructureType                     sType;
 *      const void*                         pNext;
 *      VkPipelineShaderStageCreateFlags    flags;
 *      VkShaderStageFlagBits               stage;
 *      VkShaderModule                      module;
 *      const char*                         pName;
 *      const VkSpecializationInfo*         pSpecializationInfo;
 *  } VkPipelineShaderStageCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineShaderStageCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineShaderStageCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkPipelineShaderStageCreateFlags flags;
    public VkShaderStageFlags stage;
    public VkShaderModule module;
    public Pointer pName;
    public Pointer pSpecializationInfo;

    public VkPipelineShaderStageCreateInfo() {
    }

    public VkPipelineShaderStageCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "stage",
                "module",
                "pName",
                "pSpecializationInfo"
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

    public static class ByReference extends VkPipelineShaderStageCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPipelineShaderStageCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
