package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplateCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplateCreateFlags extends VulkanFlags {
    public VulkanDescriptorUpdateTemplateCreateFlags(){
        super(new VkDescriptorUpdateTemplateCreateFlags());
    }

    public VulkanDescriptorUpdateTemplateCreateFlags(VkDescriptorUpdateTemplateCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplateCreateFlags getVk(){
        return (VkDescriptorUpdateTemplateCreateFlags) super.getVk();
    }

    public VulkanDescriptorUpdateTemplateCreateFlags(int value){
        super(new VkDescriptorUpdateTemplateCreateFlags(value));
    }

    public static class Array extends VulkanDescriptorUpdateTemplateCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateCreateFlags> {
        public Array(VkDescriptorUpdateTemplateCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorUpdateTemplateCreateFlags.Array(count));
        }

        public Array(int count, VulkanDescriptorUpdateTemplateCreateFlags o){
            this(new VkDescriptorUpdateTemplateCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorUpdateTemplateCreateFlags.Array getVk(){
            return (VkDescriptorUpdateTemplateCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorUpdateTemplateCreateFlags get(int i){
            return new VulkanDescriptorUpdateTemplateCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorUpdateTemplateCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorUpdateTemplateCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorUpdateTemplateCreateFlags.Pointer(value));
        }

        @Override
        public VkDescriptorUpdateTemplateCreateFlags.Pointer getVk(){
            return (VkDescriptorUpdateTemplateCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorUpdateTemplateCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplateCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkDescriptorUpdateTemplateCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanDescriptorUpdateTemplateCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorUpdateTemplateCreateFlags.Pointer.Array getVk(){
                return (VkDescriptorUpdateTemplateCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorUpdateTemplateCreateFlags.Pointer get(int i){
                return new VulkanDescriptorUpdateTemplateCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
