package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorPoolCreateFlags extends VulkanFlags {
    public VulkanDescriptorPoolCreateFlags(){
        super(new VkDescriptorPoolCreateFlags());
    }

    public VulkanDescriptorPoolCreateFlags(VkDescriptorPoolCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolCreateFlags getVk(){
        return (VkDescriptorPoolCreateFlags) super.getVk();
    }

    public VulkanDescriptorPoolCreateFlags(int value){
        super(new VkDescriptorPoolCreateFlags(value));
    }

    public static class Array extends VulkanDescriptorPoolCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolCreateFlags> {
        public Array(VkDescriptorPoolCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorPoolCreateFlags.Array(count));
        }

        public Array(int count, VulkanDescriptorPoolCreateFlags o){
            this(new VkDescriptorPoolCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorPoolCreateFlags.Array getVk(){
            return (VkDescriptorPoolCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorPoolCreateFlags get(int i){
            return new VulkanDescriptorPoolCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorPoolCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorPoolCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorPoolCreateFlags.Pointer(value));
        }

        @Override
        public VkDescriptorPoolCreateFlags.Pointer getVk(){
            return (VkDescriptorPoolCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorPoolCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkDescriptorPoolCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanDescriptorPoolCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorPoolCreateFlags.Pointer.Array getVk(){
                return (VkDescriptorPoolCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorPoolCreateFlags.Pointer get(int i){
                return new VulkanDescriptorPoolCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
