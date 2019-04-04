package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryPoolCreateFlags.html">khronos documentation</a>
 **/
public class VulkanQueryPoolCreateFlags extends VulkanFlags {
    public VulkanQueryPoolCreateFlags(){
        super(new VkQueryPoolCreateFlags());
    }

    public VulkanQueryPoolCreateFlags(VkQueryPoolCreateFlags vk){
        super(vk);
    }

    @Override
    public VkQueryPoolCreateFlags getVk(){
        return (VkQueryPoolCreateFlags) super.getVk();
    }

    public VulkanQueryPoolCreateFlags(int value){
        super(new VkQueryPoolCreateFlags(value));
    }

    public static class Array extends VulkanQueryPoolCreateFlags implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPoolCreateFlags> {
        public Array(VkQueryPoolCreateFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryPoolCreateFlags.Array(count));
        }

        public Array(int count, VulkanQueryPoolCreateFlags o){
            this(new VkQueryPoolCreateFlags.Array(count, o.getVk()));
        }

        @Override
        public VkQueryPoolCreateFlags.Array getVk(){
            return (VkQueryPoolCreateFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryPoolCreateFlags get(int i){
            return new VulkanQueryPoolCreateFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryPoolCreateFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryPoolCreateFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryPoolCreateFlags.Pointer(value));
        }

        @Override
        public VkQueryPoolCreateFlags.Pointer getVk(){
            return (VkQueryPoolCreateFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryPoolCreateFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPoolCreateFlags.Pointer> {
            public Array(int count) {
                super(new VkQueryPoolCreateFlags.Pointer.Array(count));
            }

            public Array(VulkanQueryPoolCreateFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryPoolCreateFlags.Pointer.Array getVk(){
                return (VkQueryPoolCreateFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryPoolCreateFlags.Pointer get(int i){
                return new VulkanQueryPoolCreateFlags.Pointer(getVk().get(i));
            }
        }
    }
}
