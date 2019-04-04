package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorType.html">khronos documentation</a>
 **/
public class VulkanDescriptorType extends VulkanEnum {
    public static final int SAMPLER = VkDescriptorType.VK_DESCRIPTOR_TYPE_SAMPLER;
    public static final int COMBINED_IMAGE_SAMPLER = VkDescriptorType.VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER;
    public static final int SAMPLED_IMAGE = VkDescriptorType.VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE;
    public static final int STORAGE_IMAGE = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_IMAGE;
    public static final int UNIFORM_TEXEL_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER;
    public static final int STORAGE_TEXEL_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER;
    public static final int UNIFORM_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER;
    public static final int STORAGE_BUFFER = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER;
    public static final int UNIFORM_BUFFER_DYNAMIC = VkDescriptorType.VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC;
    public static final int STORAGE_BUFFER_DYNAMIC = VkDescriptorType.VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC;
    public static final int INPUT_ATTACHMENT = VkDescriptorType.VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT;

    public VulkanDescriptorType(){
        super(new VkDescriptorType());
    }

    public VulkanDescriptorType(VkDescriptorType vk){
        super(vk);
    }

    @Override
    public VkDescriptorType getVk(){
        return (VkDescriptorType) super.getVk();
    }

    public VulkanDescriptorType(int value){
        super(new VkDescriptorType(value));
    }

    @Override
    public String toString() {
        if(getValue() == SAMPLER) return "SAMPLER";
        if(getValue() == COMBINED_IMAGE_SAMPLER) return "COMBINED_IMAGE_SAMPLER";
        if(getValue() == SAMPLED_IMAGE) return "SAMPLED_IMAGE";
        if(getValue() == STORAGE_IMAGE) return "STORAGE_IMAGE";
        if(getValue() == UNIFORM_TEXEL_BUFFER) return "UNIFORM_TEXEL_BUFFER";
        if(getValue() == STORAGE_TEXEL_BUFFER) return "STORAGE_TEXEL_BUFFER";
        if(getValue() == UNIFORM_BUFFER) return "UNIFORM_BUFFER";
        if(getValue() == STORAGE_BUFFER) return "STORAGE_BUFFER";
        if(getValue() == UNIFORM_BUFFER_DYNAMIC) return "UNIFORM_BUFFER_DYNAMIC";
        if(getValue() == STORAGE_BUFFER_DYNAMIC) return "STORAGE_BUFFER_DYNAMIC";
        if(getValue() == INPUT_ATTACHMENT) return "INPUT_ATTACHMENT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanDescriptorType implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorType> {
        public Array(VkDescriptorType.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorType.Array(count));
        }

        public Array(int count, VulkanDescriptorType o){
            this(new VkDescriptorType.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorType.Array getVk(){
            return (VkDescriptorType.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorType get(int i){
            return new VulkanDescriptorType(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorType.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorType.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorType.Pointer(value));
        }

        @Override
        public VkDescriptorType.Pointer getVk(){
            return (VkDescriptorType.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorType.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorType.Pointer> {
            public Array(int count) {
                super(new VkDescriptorType.Pointer.Array(count));
            }

            public Array(VulkanDescriptorType[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorType.Pointer.Array getVk(){
                return (VkDescriptorType.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorType.Pointer get(int i){
                return new VulkanDescriptorType.Pointer(getVk().get(i));
            }
        }
    }
}
