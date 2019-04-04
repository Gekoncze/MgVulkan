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

    public static class Array extends VulkanObjectEntryTypeNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectEntryTypeNVX> {
        public Array(VkObjectEntryTypeNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectEntryTypeNVX.Array(count));
        }

        public Array(int count, VulkanObjectEntryTypeNVX o){
            this(new VkObjectEntryTypeNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectEntryTypeNVX.Array getVk(){
            return (VkObjectEntryTypeNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectEntryTypeNVX get(int i){
            return new VulkanObjectEntryTypeNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectEntryTypeNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectEntryTypeNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectEntryTypeNVX.Pointer(value));
        }

        @Override
        public VkObjectEntryTypeNVX.Pointer getVk(){
            return (VkObjectEntryTypeNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectEntryTypeNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectEntryTypeNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectEntryTypeNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectEntryTypeNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectEntryTypeNVX.Pointer.Array getVk(){
                return (VkObjectEntryTypeNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectEntryTypeNVX.Pointer get(int i){
                return new VulkanObjectEntryTypeNVX.Pointer(getVk().get(i));
            }
        }
    }
}
