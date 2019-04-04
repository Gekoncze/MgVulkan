package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorSet.html">khronos documentation</a>
 **/
public class VulkanDescriptorSet extends VulkanHandle {
    public VulkanDescriptorSet(){
        super(new VkDescriptorSet());
    }

    public VulkanDescriptorSet(VkDescriptorSet vk){
        super(vk);
    }

    @Override
    public VkDescriptorSet getVk(){
        return (VkDescriptorSet) super.getVk();
    }

    public VulkanDescriptorSet(int value){
        super(new VkDescriptorSet(value));
    }

    public static class Array extends VulkanDescriptorSet implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSet> {
        public Array(VkDescriptorSet.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorSet.Array(count));
        }

        public Array(int count, VulkanDescriptorSet o){
            this(new VkDescriptorSet.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorSet.Array getVk(){
            return (VkDescriptorSet.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorSet get(int i){
            return new VulkanDescriptorSet(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorSet.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorSet.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorSet.Pointer(value));
        }

        @Override
        public VkDescriptorSet.Pointer getVk(){
            return (VkDescriptorSet.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorSet.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorSet.Pointer> {
            public Array(int count) {
                super(new VkDescriptorSet.Pointer.Array(count));
            }

            public Array(VulkanDescriptorSet[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorSet.Pointer.Array getVk(){
                return (VkDescriptorSet.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorSet.Pointer get(int i){
                return new VulkanDescriptorSet.Pointer(getVk().get(i));
            }
        }
    }
}
