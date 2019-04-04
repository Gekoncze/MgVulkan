package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorUpdateTemplate.html">khronos documentation</a>
 **/
public class VulkanDescriptorUpdateTemplate extends VulkanHandle {
    public VulkanDescriptorUpdateTemplate(){
        super(new VkDescriptorUpdateTemplate());
    }

    public VulkanDescriptorUpdateTemplate(VkDescriptorUpdateTemplate vk){
        super(vk);
    }

    @Override
    public VkDescriptorUpdateTemplate getVk(){
        return (VkDescriptorUpdateTemplate) super.getVk();
    }

    public VulkanDescriptorUpdateTemplate(int value){
        super(new VkDescriptorUpdateTemplate(value));
    }

    public static class Array extends VulkanDescriptorUpdateTemplate implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplate> {
        public Array(VkDescriptorUpdateTemplate.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorUpdateTemplate.Array(count));
        }

        public Array(int count, VulkanDescriptorUpdateTemplate o){
            this(new VkDescriptorUpdateTemplate.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorUpdateTemplate.Array getVk(){
            return (VkDescriptorUpdateTemplate.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorUpdateTemplate get(int i){
            return new VulkanDescriptorUpdateTemplate(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorUpdateTemplate.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorUpdateTemplate.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorUpdateTemplate.Pointer(value));
        }

        @Override
        public VkDescriptorUpdateTemplate.Pointer getVk(){
            return (VkDescriptorUpdateTemplate.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorUpdateTemplate.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorUpdateTemplate.Pointer> {
            public Array(int count) {
                super(new VkDescriptorUpdateTemplate.Pointer.Array(count));
            }

            public Array(VulkanDescriptorUpdateTemplate[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorUpdateTemplate.Pointer.Array getVk(){
                return (VkDescriptorUpdateTemplate.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorUpdateTemplate.Pointer get(int i){
                return new VulkanDescriptorUpdateTemplate.Pointer(getVk().get(i));
            }
        }
    }
}
