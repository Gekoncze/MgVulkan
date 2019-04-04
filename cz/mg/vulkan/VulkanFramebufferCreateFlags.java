package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFramebufferCreateFlags.html">khronos documentation</a>
 **/
public class VulkanFramebufferCreateFlags extends VulkanFlags {
    public VulkanFramebufferCreateFlags(){
        super(new VkFramebufferCreateFlags());
    }

    public VulkanFramebufferCreateFlags(VkFramebufferCreateFlags vk){
        super(vk);
    }

    @Override
    public VkFramebufferCreateFlags getVk(){
        return (VkFramebufferCreateFlags) super.getVk();
    }

    public VulkanFramebufferCreateFlags(int value){
        super(new VkFramebufferCreateFlags(value));
    }

    public static class Array extends VulkanFramebufferCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanFramebufferCreateFlags> {
        public Array(VkFramebufferCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFramebufferCreateFlags.Array(count));
        }

        public Array(int count, VulkanFramebufferCreateFlags o){
            this(new VkFramebufferCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkFramebufferCreateFlags.Array getVk(){
            return (VkFramebufferCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFramebufferCreateFlags get(int i){
            return new VulkanFramebufferCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFramebufferCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFramebufferCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkFramebufferCreateFlags.Pointer(value));
        }

        @Override
        public VkFramebufferCreateFlags.Pointer getVk(){
            return (VkFramebufferCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanFramebufferCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFramebufferCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkFramebufferCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanFramebufferCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFramebufferCreateFlags.Pointer.Array getVk(){
                return (VkFramebufferCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFramebufferCreateFlags.Pointer get(int i){
                return new VulkanFramebufferCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
