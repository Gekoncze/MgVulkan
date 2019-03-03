package cz.mg.vulkan.jna.structures;

import com.sun.jna.Structure;
import com.sun.jna.Pointer;
import java.util.Arrays;
import java.util.List;
import cz.mg.vulkan.jna.types.*;
import cz.mg.vulkan.jna.flags.*;
import cz.mg.vulkan.jna.enums.*;


/**
 *  typedef struct VkImageCreateInfo {
 *      VkStructureType          sType;
 *      const void*              pNext;
 *      VkImageCreateFlags       flags;
 *      VkImageType              imageType;
 *      VkFormat                 format;
 *      VkExtent3D               extent;
 *      uint32_t                 mipLevels;
 *      uint32_t                 arrayLayers;
 *      VkSampleCountFlagBits    samples;
 *      VkImageTiling            tiling;
 *      VkImageUsageFlags        usage;
 *      VkSharingMode            sharingMode;
 *      uint32_t                 queueFamilyIndexCount;
 *      const uint32_t*          pQueueFamilyIndices;
 *      VkImageLayout            initialLayout;
 *  } VkImageCreateInfo;
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCreateInfo.html">khronos documentation</a>
 **/
public class VkImageCreateInfo extends Structure {
    public VkStructureType sType;
    public Pointer pNext;
    public VkImageCreateFlags flags;
    public VkImageType imageType;
    public VkFormat format;
    public VkExtent3D extent;
    public uint32_t mipLevels;
    public uint32_t arrayLayers;
    public VkSampleCountFlags samples;
    public VkImageTiling tiling;
    public VkImageUsageFlags usage;
    public VkSharingMode sharingMode;
    public uint32_t queueFamilyIndexCount;
    public Pointer pQueueFamilyIndices;
    public VkImageLayout initialLayout;

    public VkImageCreateInfo() {
    }

    public VkImageCreateInfo(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(new String[]{
                "sType",
                "pNext",
                "flags",
                "imageType",
                "format",
                "extent",
                "mipLevels",
                "arrayLayers",
                "samples",
                "tiling",
                "usage",
                "sharingMode",
                "queueFamilyIndexCount",
                "pQueueFamilyIndices",
                "initialLayout"
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

    public static class ByReference extends VkImageCreateInfo implements Structure.ByReference {
        public ByReference(){
        }

        public ByReference(Pointer pointer){
            super(pointer);
        }
    }

    public static class ByValue extends VkImageCreateInfo implements Structure.ByValue {
        public ByValue(){
        }

        public ByValue(Pointer pointer){
            super(pointer);
        }
    }
}
