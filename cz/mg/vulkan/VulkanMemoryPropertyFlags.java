package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryPropertyFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryPropertyFlags extends VulkanFlags {
    public VulkanMemoryPropertyFlags(){
        super(new VkMemoryPropertyFlags());
    }

    public VulkanMemoryPropertyFlags(VkMemoryPropertyFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryPropertyFlags getVk(){
        return (VkMemoryPropertyFlags) super.getVk();
    }

    public VulkanMemoryPropertyFlags(int value){
        super(new VkMemoryPropertyFlags(value));
    }

    public static class Array extends VulkanMemoryPropertyFlags implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryPropertyFlags> {
        public Array(VkMemoryPropertyFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryPropertyFlags.Array(count));
        }

        public Array(int count, VulkanMemoryPropertyFlags o){
            this(new VkMemoryPropertyFlags.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryPropertyFlags.Array getVk(){
            return (VkMemoryPropertyFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryPropertyFlags get(int i){
            return new VulkanMemoryPropertyFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryPropertyFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryPropertyFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryPropertyFlags.Pointer(value));
        }

        @Override
        public VkMemoryPropertyFlags.Pointer getVk(){
            return (VkMemoryPropertyFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryPropertyFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryPropertyFlags.Pointer> {
            public Array(int count) {
                super(new VkMemoryPropertyFlags.Pointer.Array(count));
            }

            public Array(VulkanMemoryPropertyFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryPropertyFlags.Pointer.Array getVk(){
                return (VkMemoryPropertyFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryPropertyFlags.Pointer get(int i){
                return new VulkanMemoryPropertyFlags.Pointer(getVk().get(i));
            }
        }
    }
}
