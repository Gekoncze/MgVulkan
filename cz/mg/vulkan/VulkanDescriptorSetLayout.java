package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayout.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetLayout extends VulkanHandle {
    public VulkanDescriptorSetLayout(){
        super(new VkDescriptorSetLayout());
    }

    public VulkanDescriptorSetLayout(VkDescriptorSetLayout vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayout getVk(){
        return (VkDescriptorSetLayout) super.getVk();
    }

    public VulkanDescriptorSetLayout(int value){
        super(new VkDescriptorSetLayout(value));
    }

    public static class Array extends VulkanDescriptorSetLayout implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayout> {
        public Array(VkDescriptorSetLayout.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetLayout.Array(count));
        }

        public Array(int count, VulkanDescriptorSetLayout o){
            this(new VkDescriptorSetLayout.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayout.Array getVk(){
            return (VkDescriptorSetLayout.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayout get(int i){
            return new VulkanDescriptorSetLayout(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetLayout.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetLayout.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetLayout.Pointer(value));
        }

        @Override
        public VkDescriptorSetLayout.Pointer getVk(){
            return (VkDescriptorSetLayout.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetLayout.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayout.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetLayout.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetLayout[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetLayout.Pointer.Array getVk(){
                return (VkDescriptorSetLayout.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetLayout.Pointer get(int i){
                return new VulkanDescriptorSetLayout.Pointer(getVk().get(i));
            }
        }
    }
}
