package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassCreateFlags.html">khronos documentation</a>
 **/
public class VulkanRenderPassCreateFlags extends VulkanFlags {
    public VulkanRenderPassCreateFlags(){
        super(new VkRenderPassCreateFlags());
    }

    public VulkanRenderPassCreateFlags(VkRenderPassCreateFlags vk){
        super(vk);
    }

    @Override
    public VkRenderPassCreateFlags getVk(){
        return (VkRenderPassCreateFlags) super.getVk();
    }

    public VulkanRenderPassCreateFlags(int value){
        super(new VkRenderPassCreateFlags(value));
    }

    public static class Array extends VulkanRenderPassCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassCreateFlags> {
        public Array(VkRenderPassCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRenderPassCreateFlags.Array(count));
        }

        public Array(int count, VulkanRenderPassCreateFlags o){
            this(new VkRenderPassCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPassCreateFlags.Array getVk(){
            return (VkRenderPassCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPassCreateFlags get(int i){
            return new VulkanRenderPassCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRenderPassCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRenderPassCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkRenderPassCreateFlags.Pointer(value));
        }

        @Override
        public VkRenderPassCreateFlags.Pointer getVk(){
            return (VkRenderPassCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanRenderPassCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPassCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkRenderPassCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanRenderPassCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRenderPassCreateFlags.Pointer.Array getVk(){
                return (VkRenderPassCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRenderPassCreateFlags.Pointer get(int i){
                return new VulkanRenderPassCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
