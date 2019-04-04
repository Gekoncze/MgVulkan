package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryMapFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryMapFlags extends VulkanFlags {
    public VulkanMemoryMapFlags(){
        super(new VkMemoryMapFlags());
    }

    public VulkanMemoryMapFlags(VkMemoryMapFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryMapFlags getVk(){
        return (VkMemoryMapFlags) super.getVk();
    }

    public VulkanMemoryMapFlags(int value){
        super(new VkMemoryMapFlags(value));
    }

    public static class Array extends VulkanMemoryMapFlags implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryMapFlags> {
        public Array(VkMemoryMapFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryMapFlags.Array(count));
        }

        public Array(int count, VulkanMemoryMapFlags o){
            this(new VkMemoryMapFlags.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryMapFlags.Array getVk(){
            return (VkMemoryMapFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryMapFlags get(int i){
            return new VulkanMemoryMapFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryMapFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryMapFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryMapFlags.Pointer(value));
        }

        @Override
        public VkMemoryMapFlags.Pointer getVk(){
            return (VkMemoryMapFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryMapFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryMapFlags.Pointer> {
            public Array(int count) {
                super(new VkMemoryMapFlags.Pointer.Array(count));
            }

            public Array(VulkanMemoryMapFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryMapFlags.Pointer.Array getVk(){
                return (VkMemoryMapFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryMapFlags.Pointer get(int i){
                return new VulkanMemoryMapFlags.Pointer(getVk().get(i));
            }
        }
    }
}
