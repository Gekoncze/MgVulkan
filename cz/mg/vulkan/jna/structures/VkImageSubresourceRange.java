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
 *  typedef struct VkImageSubresourceRange {
 *      VkImageAspectFlags    aspectMask;
 *      uint32_t              baseMipLevel;
 *      uint32_t              levelCount;
 *      uint32_t              baseArrayLayer;
 *      uint32_t              layerCount;
 *  } VkImageSubresourceRange;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageSubresourceRange.html">khronos documentation</a>
 **/
public class VkImageSubresourceRange extends Structure {
    public VkImageAspectFlags aspectMask;
    public uint32_t baseMipLevel;
    public uint32_t levelCount;
    public uint32_t baseArrayLayer;
    public uint32_t layerCount;

    public VkImageSubresourceRange() {
    }

    public VkImageSubresourceRange(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "aspectMask",
                "baseMipLevel",
                "levelCount",
                "baseArrayLayer",
                "layerCount"
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

    public static class ByReference extends VkImageSubresourceRange implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkImageSubresourceRange implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
