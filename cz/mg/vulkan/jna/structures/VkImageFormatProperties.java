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
 *  typedef struct VkImageFormatProperties {
 *      VkExtent3D            maxExtent;
 *      uint32_t              maxMipLevels;
 *      uint32_t              maxArrayLayers;
 *      VkSampleCountFlags    sampleCounts;
 *      VkDeviceSize          maxResourceSize;
 *  } VkImageFormatProperties;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageFormatProperties.html">khronos documentation</a>
 **/
public class VkImageFormatProperties extends Structure {
    public VkExtent3D maxExtent;
    public uint32_t maxMipLevels;
    public uint32_t maxArrayLayers;
    public VkSampleCountFlags sampleCounts;
    public VkDeviceSize maxResourceSize;

    public VkImageFormatProperties() {
    }

    public VkImageFormatProperties(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "maxExtent",
                "maxMipLevels",
                "maxArrayLayers",
                "sampleCounts",
                "maxResourceSize"
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

    public static class ByReference extends VkImageFormatProperties implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkImageFormatProperties implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
