package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSetLayoutCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorSetLayoutCreateFlags extends VulkanFlags {
    public VulkanDescriptorSetLayoutCreateFlags(){
        super(new VkDescriptorSetLayoutCreateFlags());
    }

    public VulkanDescriptorSetLayoutCreateFlags(VkDescriptorSetLayoutCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorSetLayoutCreateFlags getVk(){
        return (VkDescriptorSetLayoutCreateFlags) super.getVk();
    }

    public VulkanDescriptorSetLayoutCreateFlags(int value){
        super(new VkDescriptorSetLayoutCreateFlags(value));
    }

    public static class Array extends VulkanDescriptorSetLayoutCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutCreateFlags> {
        public Array(VkDescriptorSetLayoutCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSetLayoutCreateFlags.Array(count));
        }

        public Array(int count, VulkanDescriptorSetLayoutCreateFlags o){
            this(new VkDescriptorSetLayoutCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSetLayoutCreateFlags.Array getVk(){
            return (VkDescriptorSetLayoutCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSetLayoutCreateFlags get(int i){
            return new VulkanDescriptorSetLayoutCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSetLayoutCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSetLayoutCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSetLayoutCreateFlags.Pointer(value));
        }

        @Override
        public VkDescriptorSetLayoutCreateFlags.Pointer getVk(){
            return (VkDescriptorSetLayoutCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSetLayoutCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSetLayoutCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSetLayoutCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSetLayoutCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSetLayoutCreateFlags.Pointer.Array getVk(){
                return (VkDescriptorSetLayoutCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSetLayoutCreateFlags.Pointer get(int i){
                return new VulkanDescriptorSetLayoutCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
