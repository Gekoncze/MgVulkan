package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilFaceFlags.html">khronos documentation</a>
 **/
public class VulkanStencilFaceFlags extends VulkanFlags {
    public VulkanStencilFaceFlags(){
        super(new VkStencilFaceFlags());
    }

    public VulkanStencilFaceFlags(VkStencilFaceFlags vk){
        super(vk);
    }

    @Override
    public VkStencilFaceFlags getVk(){
        return (VkStencilFaceFlags) super.getVk();
    }

    public VulkanStencilFaceFlags(int value){
        super(new VkStencilFaceFlags(value));
    }

    public static class Array extends VulkanStencilFaceFlags implements cz.mg.collections.array.ReadonlyArray<VulkanStencilFaceFlags> {
        public Array(VkStencilFaceFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkStencilFaceFlags.Array(count));
        }

        public Array(int count, VulkanStencilFaceFlags o){
            this(new VkStencilFaceFlags.Array(count, o.getVk()));
        }

        @Override
        public VkStencilFaceFlags.Array getVk(){
            return (VkStencilFaceFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanStencilFaceFlags get(int i){
            return new VulkanStencilFaceFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkStencilFaceFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkStencilFaceFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkStencilFaceFlags.Pointer(value));
        }

        @Override
        public VkStencilFaceFlags.Pointer getVk(){
            return (VkStencilFaceFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanStencilFaceFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanStencilFaceFlags.Pointer> {
            public Array(int count) {
                super(new VkStencilFaceFlags.Pointer.Array(count));
            }

            public Array(VulkanStencilFaceFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkStencilFaceFlags.Pointer.Array getVk(){
                return (VkStencilFaceFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanStencilFaceFlags.Pointer get(int i){
                return new VulkanStencilFaceFlags.Pointer(getVk().get(i));
            }
        }
    }
}
