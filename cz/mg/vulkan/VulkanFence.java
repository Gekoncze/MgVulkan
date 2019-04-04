package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFence.html">khronos documentation</a>
 **/
public class VulkanFence extends VulkanHandle {
    public VulkanFence(){
        super(new VkFence());
    }

    public VulkanFence(VkFence vk){
        super(vk);
    }

    @Override
    public VkFence getVk(){
        return (VkFence) super.getVk();
    }

    public VulkanFence(int value){
        super(new VkFence(value));
    }

    public static class Array extends VulkanFence implements cz.mg.collections.array.ReadonlyArray<VulkanFence> {
        public Array(VkFence.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFence.Array(count));
        }

        public Array(int count, VulkanFence o){
            this(new VkFence.Array(count, o.getVk()));
        }

        @Override
        public VkFence.Array getVk(){
            return (VkFence.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFence get(int i){
            return new VulkanFence(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFence.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFence.Pointer());
        }

        public Pointer(long value) {
            this(new VkFence.Pointer(value));
        }

        @Override
        public VkFence.Pointer getVk(){
            return (VkFence.Pointer) super.getVk();
        }

        public static class Array extends VulkanFence.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFence.Pointer> {
            public Array(int count) {
                super(new VkFence.Pointer.Array(count));
            }

            public Array(VulkanFence[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFence.Pointer.Array getVk(){
                return (VkFence.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFence.Pointer get(int i){
                return new VulkanFence.Pointer(getVk().get(i));
            }
        }
    }
}
