package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFlags.html">khronos documentation</a>
 **/
public class VulkanFlags extends VulkanUInt32 {
    public VulkanFlags(){
        super(new VkFlags());
    }

    public VulkanFlags(VkFlags vk){
        super(vk);
    }

    @Override
    public VkFlags getVk(){
        return (VkFlags) super.getVk();
    }

    public VulkanFlags(int value){
        super(new VkFlags(value));
    }

    public static class Array extends VulkanFlags implements cz.mg.collections.array.ReadonlyArray<VulkanFlags> {
        public Array(VkFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFlags.Array(count));
        }

        public Array(int count, VulkanFlags o){
            this(new VkFlags.Array(count, o.getVk()));
        }

        @Override
        public VkFlags.Array getVk(){
            return (VkFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFlags get(int i){
            return new VulkanFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkFlags.Pointer(value));
        }

        @Override
        public VkFlags.Pointer getVk(){
            return (VkFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFlags.Pointer> {
            public Array(int count) {
                super(new VkFlags.Pointer.Array(count));
            }

            public Array(VulkanFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFlags.Pointer.Array getVk(){
                return (VkFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFlags.Pointer get(int i){
                return new VulkanFlags.Pointer(getVk().get(i));
            }
        }
    }
}
