package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInstanceCreateFlags.html">khronos documentation</a>
 **/
public class VulkanInstanceCreateFlags extends VulkanFlags {
    public VulkanInstanceCreateFlags(){
        super(new VkInstanceCreateFlags());
    }

    public VulkanInstanceCreateFlags(VkInstanceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkInstanceCreateFlags getVk(){
        return (VkInstanceCreateFlags) super.getVk();
    }

    public VulkanInstanceCreateFlags(int value){
        super(new VkInstanceCreateFlags(value));
    }

    public static class Array extends VulkanInstanceCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanInstanceCreateFlags> {
        public Array(VkInstanceCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInstanceCreateFlags.Array(count));
        }

        public Array(int count, VulkanInstanceCreateFlags o){
            this(new VkInstanceCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkInstanceCreateFlags.Array getVk(){
            return (VkInstanceCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInstanceCreateFlags get(int i){
            return new VulkanInstanceCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInstanceCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInstanceCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkInstanceCreateFlags.Pointer(value));
        }

        @Override
        public VkInstanceCreateFlags.Pointer getVk(){
            return (VkInstanceCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanInstanceCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInstanceCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkInstanceCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanInstanceCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInstanceCreateFlags.Pointer.Array getVk(){
                return (VkInstanceCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInstanceCreateFlags.Pointer get(int i){
                return new VulkanInstanceCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
