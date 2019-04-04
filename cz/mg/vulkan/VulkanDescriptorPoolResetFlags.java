package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDescriptorPoolResetFlags.html">khronos documentation</a>
 **/
public class VulkanDescriptorPoolResetFlags extends VulkanFlags {
    public VulkanDescriptorPoolResetFlags(){
        super(new VkDescriptorPoolResetFlags());
    }

    public VulkanDescriptorPoolResetFlags(VkDescriptorPoolResetFlags vk){
        super(vk);
    }

    @Override
    public VkDescriptorPoolResetFlags getVk(){
        return (VkDescriptorPoolResetFlags) super.getVk();
    }

    public VulkanDescriptorPoolResetFlags(int value){
        super(new VkDescriptorPoolResetFlags(value));
    }

    public static class Array extends VulkanDescriptorPoolResetFlags implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolResetFlags> {
        public Array(VkDescriptorPoolResetFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDescriptorPoolResetFlags.Array(count));
        }

        public Array(int count, VulkanDescriptorPoolResetFlags o){
            this(new VkDescriptorPoolResetFlags.Array(count, o.getVk()));
        }

        @Override
        public VkDescriptorPoolResetFlags.Array getVk(){
            return (VkDescriptorPoolResetFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDescriptorPoolResetFlags get(int i){
            return new VulkanDescriptorPoolResetFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDescriptorPoolResetFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDescriptorPoolResetFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkDescriptorPoolResetFlags.Pointer(value));
        }

        @Override
        public VkDescriptorPoolResetFlags.Pointer getVk(){
            return (VkDescriptorPoolResetFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanDescriptorPoolResetFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDescriptorPoolResetFlags.Pointer> {
            public Array(int count) {
                super(new VkDescriptorPoolResetFlags.Pointer.Array(count));
            }

            public Array(VulkanDescriptorPoolResetFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDescriptorPoolResetFlags.Pointer.Array getVk(){
                return (VkDescriptorPoolResetFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDescriptorPoolResetFlags.Pointer get(int i){
                return new VulkanDescriptorPoolResetFlags.Pointer(getVk().get(i));
            }
        }
    }
}
