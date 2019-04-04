package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTableNVX.html">khronos documentation</a>
 **/
public class VulkanObjectTableNVX extends VulkanHandle {
    public VulkanObjectTableNVX(){
        super(new VkObjectTableNVX());
    }

    public VulkanObjectTableNVX(VkObjectTableNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableNVX getVk(){
        return (VkObjectTableNVX) super.getVk();
    }

    public VulkanObjectTableNVX(int value){
        super(new VkObjectTableNVX(value));
    }

    public static class Array extends VulkanObjectTableNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableNVX> {
        public Array(VkObjectTableNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkObjectTableNVX.Array(count));
        }

        public Array(int count, VulkanObjectTableNVX o){
            this(new VkObjectTableNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTableNVX.Array getVk(){
            return (VkObjectTableNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTableNVX get(int i){
            return new VulkanObjectTableNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkObjectTableNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkObjectTableNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkObjectTableNVX.Pointer(value));
        }

        @Override
        public VkObjectTableNVX.Pointer getVk(){
            return (VkObjectTableNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanObjectTableNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableNVX.Pointer> {
            public Array(int count) {
                super(new VkObjectTableNVX.Pointer.Array(count));
            }

            public Array(VulkanObjectTableNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkObjectTableNVX.Pointer.Array getVk(){
                return (VkObjectTableNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanObjectTableNVX.Pointer get(int i){
                return new VulkanObjectTableNVX.Pointer(getVk().get(i));
            }
        }
    }
}
