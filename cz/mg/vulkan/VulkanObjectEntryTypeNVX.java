package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectEntryTypeNVX.html">khronos documentation</a>
 **/
public class VulkanObjectEntryTypeNVX extends VulkanEnum {
    public static final int OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX;
    public static final int OBJECT_ENTRY_TYPE_PIPELINE_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX;
    public static final int OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX;
    public static final int OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX;
    public static final int OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX = VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX;

    public VulkanObjectEntryTypeNVX(){
        super(new VkObjectEntryTypeNVX());
    }

    public VulkanObjectEntryTypeNVX(VkObjectEntryTypeNVX vk){
        super(vk);
    }

    @Override
    public VkObjectEntryTypeNVX getVk(){
        return (VkObjectEntryTypeNVX) super.getVk();
    }

    public VulkanObjectEntryTypeNVX(int value){
        super(new VkObjectEntryTypeNVX(value));
    }

    @Override
    public String toString() {
        if(getValue() == OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX) return "OBJECT_ENTRY_TYPE_DESCRIPTOR_SET_NVX";
        if(getValue() == OBJECT_ENTRY_TYPE_PIPELINE_NVX) return "OBJECT_ENTRY_TYPE_PIPELINE_NVX";
        if(getValue() == OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX) return "OBJECT_ENTRY_TYPE_INDEX_BUFFER_NVX";
        if(getValue() == OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX) return "OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX";
        if(getValue() == OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX) return "OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX";
        return "UNKNOWN";
    }
}
