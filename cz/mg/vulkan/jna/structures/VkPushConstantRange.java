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
 *  typedef struct VkPushConstantRange {
 *      VkShaderStageFlags    stageFlags;
 *      uint32_t              offset;
 *      uint32_t              size;
 *  } VkPushConstantRange;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPushConstantRange.html">khronos documentation</a>
 **/
public class VkPushConstantRange extends Structure {
    public VkShaderStageFlags stageFlags;
    public uint32_t offset;
    public uint32_t size;

    public VkPushConstantRange() {
    }

    public VkPushConstantRange(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "stageFlags",
                "offset",
                "size"
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

    public static class ByReference extends VkPushConstantRange implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkPushConstantRange implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
