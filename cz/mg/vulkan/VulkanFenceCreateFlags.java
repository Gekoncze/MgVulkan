package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceCreateFlags.html">khronos documentation</a>
 **/
public class VulkanFenceCreateFlags extends VulkanFlags {
    public VulkanFenceCreateFlags(){
        super(new VkFenceCreateFlags());
    }

    public VulkanFenceCreateFlags(VkFenceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkFenceCreateFlags getVk(){
        return (VkFenceCreateFlags) super.getVk();
    }

    public VulkanFenceCreateFlags(int value){
        super(new VkFenceCreateFlags(value));
    }

    public static class Array extends VulkanFenceCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanFenceCreateFlags> {
        public Array(VkFenceCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFenceCreateFlags.Array(count));
        }

        public Array(int count, VulkanFenceCreateFlags o){
            this(new VkFenceCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkFenceCreateFlags.Array getVk(){
            return (VkFenceCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFenceCreateFlags get(int i){
            return new VulkanFenceCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFenceCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFenceCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkFenceCreateFlags.Pointer(value));
        }

        @Override
        public VkFenceCreateFlags.Pointer getVk(){
            return (VkFenceCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanFenceCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFenceCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkFenceCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanFenceCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFenceCreateFlags.Pointer.Array getVk(){
                return (VkFenceCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFenceCreateFlags.Pointer get(int i){
                return new VulkanFenceCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
