package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryResultFlags.html">khronos documentation</a>
 **/
public class VulkanQueryResultFlags extends VulkanFlags {
    public VulkanQueryResultFlags(){
        super(new VkQueryResultFlags());
    }

    public VulkanQueryResultFlags(VkQueryResultFlags vk){
        super(vk);
    }

    @Override
    public VkQueryResultFlags getVk(){
        return (VkQueryResultFlags) super.getVk();
    }

    public VulkanQueryResultFlags(int value){
        super(new VkQueryResultFlags(value));
    }

    public static class Array extends VulkanQueryResultFlags implements cz.mg.collections.array.ReadonlyArray<VulkanQueryResultFlags> {
        public Array(VkQueryResultFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryResultFlags.Array(count));
        }

        public Array(int count, VulkanQueryResultFlags o){
            this(new VkQueryResultFlags.Array(count, o.getVk()));
        }

        @Override
        public VkQueryResultFlags.Array getVk(){
            return (VkQueryResultFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryResultFlags get(int i){
            return new VulkanQueryResultFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryResultFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryResultFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryResultFlags.Pointer(value));
        }

        @Override
        public VkQueryResultFlags.Pointer getVk(){
            return (VkQueryResultFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryResultFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryResultFlags.Pointer> {
            public Array(int count) {
                super(new VkQueryResultFlags.Pointer.Array(count));
            }

            public Array(VulkanQueryResultFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryResultFlags.Pointer.Array getVk(){
                return (VkQueryResultFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryResultFlags.Pointer get(int i){
                return new VulkanQueryResultFlags.Pointer(getVk().get(i));
            }
        }
    }
}
