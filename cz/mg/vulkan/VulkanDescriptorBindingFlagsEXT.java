package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorBindingFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanDescriptorBindingFlagsEXT extends VulkanFlags {
    public VulkanDescriptorBindingFlagsEXT(){
        super(new VkDescriptorBindingFlagsEXT());
    }

    public VulkanDescriptorBindingFlagsEXT(VkDescriptorBindingFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkDescriptorBindingFlagsEXT getVk(){
        return (VkDescriptorBindingFlagsEXT) super.getVk();
    }

    public VulkanDescriptorBindingFlagsEXT(int value){
        super(new VkDescriptorBindingFlagsEXT(value));
    }

    public static class Array extends VulkanDescriptorBindingFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorBindingFlagsEXT> {
        public Array(VkDescriptorBindingFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorBindingFlagsEXT.Array(count));
        }

        public Array(int count, VulkanDescriptorBindingFlagsEXT o){
            this(new VkDescriptorBindingFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorBindingFlagsEXT.Array getVk(){
            return (VkDescriptorBindingFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorBindingFlagsEXT get(int i){
            return new VulkanDescriptorBindingFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorBindingFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorBindingFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorBindingFlagsEXT.Pointer(value));
        }

        @Override
        public VkDescriptorBindingFlagsEXT.Pointer getVk(){
            return (VkDescriptorBindingFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorBindingFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorBindingFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkDescriptorBindingFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanDescriptorBindingFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorBindingFlagsEXT.Pointer.Array getVk(){
                return (VkDescriptorBindingFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorBindingFlagsEXT.Pointer get(int i){
                return new VulkanDescriptorBindingFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
